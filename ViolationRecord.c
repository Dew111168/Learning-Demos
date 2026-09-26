#define _CRT_SECURE_NO_WARNINGS
#define UNPROCESSED "0"
#define PROCESSED "1"
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define SIZE 100
/*思想：带头结点的单链表，全局头指针head，每条数据都存在Node的vr里，节点靠next指针相连*/
/*增加是通过malloc动态分配内存空间创建节点，修改后继指针将节点接入链表，
删除是通过前驱节点修改指针并释放内存；
修改时改定位结点内部数据域，
查询是遍历读取的节点数据*/
/*车辆违章记录 数据结构体*/
typedef struct ViolationRecord{
    char num[20];       //违章车牌号
    char name[SIZE];    //车主姓名
    char type[20];      //违章类型
    char time[15];      //违章时间
    int score;          //违章扣分
    double fine;        //罚款金额
    char situation[SIZE];     //处理状态
}ViolationRecord;

/*构建存储违章记录的单链表*/
typedef struct Node{
    ViolationRecord record;
    struct Node* next;
}Node;

/*空链表初始化*/
Node* head;
void InitLink(const char* filepath){
    head=(Node*)malloc(sizeof(Node));
    if(head==NULL) return;
    head->next=NULL;
/*文件打开*/
    FILE* fp=fopen(filepath,"r");
    if(fp==NULL) return;
    int ch;
/*1.违章记录的录入*/
    while((ch=fgetc(fp))!=EOF){
        fseek(fp,-1,SEEK_CUR);
        
        Node *newnode=(Node*)malloc(sizeof(Node));
        if(newnode==NULL) return;
        fscanf(fp,"%s %s %s %s %d %lf %s\n",
                newnode->record.num,
                newnode->record.name,
                newnode->record.type,
                newnode->record.time,
                &newnode->record.score,
                &newnode->record.fine,
                newnode->record.situation
        );

        newnode->next=head->next;
        head->next=newnode;
    }
    fclose(fp);
}

/*2.保存到文件中：遍历所有结点，将结点中的值域写入文件*/
void SaveFile(const char*filename){
    FILE* fp=fopen(filename,"w");
    if(fp==NULL) return;
    for(Node *p=head->next;p!=NULL;p=p->next){
        fprintf(fp,"%s %s %s %s %d %lf %s\n",
                p->record.num,
                p->record.name,
                p->record.type,
                p->record.time,
                p->record.score,
                p->record.fine,
                p->record.situation
        );
    }
    fclose(fp);
}

/*3.查：通过比对违章车牌号，车主姓名，违章类型，和罚款金额范围来查找 违章记录整体数据 */
void SearchByNum(const char*num){
    int count=0;
    printf("当前违章记录：\n");
    printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态");

    for(Node *p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.num,num)==0){
            count++;
            printf("%s %s %s %s %d %lf %s\n",
                    p->record.num,
                    p->record.name,
                    p->record.type,
                    p->record.time,
                    p->record.score,
                    p->record.fine,
                    p->record.situation);
        }
    }
    printf("找到%d条违章记录:\n",count);
}
void SearchByName(const char*name){
    int count=0;
    printf("当前违章记录：\n");
    printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态");

    for(Node* p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.name,name)==0){
            count++;
            printf("%s %s %s %s %d %lf %s\n",
                    p->record.num,
                    p->record.name,
                    p->record.type,
                    p->record.time,
                    p->record.score,
                    p->record.fine,
                    p->record.situation);
        }
    }
    printf("找到%d条违章记录:\n",count);
}
void SearchByType(const char*type){
    int count=0;
    printf("当前违章记录：\n");
    printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态");

    for(Node *p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.type,type)==0){
            count++;
            printf("%s %s %s %s %d %lf %s\n",
                    p->record.num,
                    p->record.name,
                    p->record.type,
                    p->record.time,
                    p->record.score,
                    p->record.fine,
                    p->record.situation);
        }
    }
    printf("找到%d条违章记录:\n",count);
}
void SearchByFine(double min_fine,double max_fine){
    int count=0;
    printf("当前违章记录：\n");
    printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态");

    for(Node *p=head->next;p!=NULL;p=p->next){
            if(p->record.fine>=min_fine && p->record.fine<=max_fine){
                count++;
            printf("%s %s %s %s %d %lf %s\n",
                    p->record.num,
                    p->record.name,
                    p->record.type,
                    p->record.time,
                    p->record.score,
                    p->record.fine,
                    p->record.situation);
        }
    }
    printf("找到%d条违章记录:\n",count);
}

/*4.增：头插法插入新的违章记录数据*/
void Insert(){
    Node *newnode=(Node*)malloc(sizeof(Node));
        if(newnode==NULL) return;
        printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态");
        scanf("%s %s %s %s %d %lf %s",
                newnode->record.num,
                newnode->record.name,
                newnode->record.type,
                newnode->record.time,
                &newnode->record.score,
                &newnode->record.fine,
                newnode->record.situation);

    newnode->next = head->next;
    head->next = newnode;
    printf("插入成功\n");
}
/*5.统计:各违章类型的发生次数，未处理违章总条数，总罚款金额，按车牌号统计单车主扣分总和*/
void CountViolationTypes(Node* head,char types[][20],int typeCount[],
int*count){
    *count=0;
    for(Node*p=head->next;p!=NULL;p=p->next){
        int found=0;
        for(int i=0;i<*count;i++){
            if(strcmp(p->record.type,types[i])==0){
                typeCount[i]++;
                found=1; break;
            }
        }
        if(!found){
            strcpy(types[*count],p->record.type);
            typeCount[*count]=1;
            (*count)++;
        }
    }
}
void CountUnprocessed(Node* head, int* totalUnprocessed, double* totalFine) {
    *totalUnprocessed = 0;
    *totalFine = 0.0;
    if (head == NULL) return;

    for (Node* p = head->next; p != NULL;p = p->next) {
        if (p->record.situation[0] == '\0') {
            continue;
        }

        if (strcmp(p->record.situation, UNPROCESSED) == 0) {
            
            (*totalUnprocessed)++;       
            *totalFine += p->record.fine;
        }
    }
}
int CountScoreByNum(Node* head,char num[]){
    int totalScore=0;
    for(Node* p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.num,num)==0){
            totalScore += p->record.score;
        }
    }
    return totalScore;
}
/*6.删：通过查找违章车牌号来删除一条违章记录*/
void Delete(const char*num){
    Node *p=head;
    Node *q=NULL;
    int found=0;
    while(p!=NULL){
        if(strcmp(p->next->record.num,num)==0){
           if(q==NULL){
            head=p->next;
           }else{
            q->next=p->next;
           }
           free(p);
           found=1;
           break;
        }
    }
    if(found){
        printf("删除成功\n");
    }else{
        printf("未找到节点\n");
    }
}

/*7.改：通过定位违章车牌号来更改所对应的 违章扣分，罚款金额，和处理情况*/
void ChangeScore(const char*num,int newscore){
    for(Node *p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.num,num)==0){
            p->record.score=newscore;
        }
    }
    SaveFile("record.txt");
}
void ChangeFine(const char*num,double newfine){
    for(Node *p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.num,num)==0){
            p->record.fine=newfine;
        }
    }
    SaveFile("record.txt");
}
void ChangeSituation(const char*num,char *newsituation){
    for(Node *p=head->next;p!=NULL;p=p->next){
        if(strcmp(p->record.num,num)==0){
        strcpy(p->record.situation,newsituation);
        }
    }
    SaveFile("record.txt");
}

/*8.输出：输出一条违章记录信息*/
void Show(){
    printf("当前违章记录信息:\n");
    printf("违章车牌号，车主姓名，违章类型，违章时间，扣分，罚款金额，处理状态\n");
    for(Node* p=head->next;p!=NULL;p=p->next){
        printf("%s %s %s %s %d %lf %s\n",
                    p->record.num,
                    p->record.name,
                    p->record.type,
                    p->record.time,
                    p->record.score,
                    p->record.fine,
                    p->record.situation);
    }
}

/*销毁整条存储违章记录的链表*/
void Destroy(){
    while(head->next!=NULL){
        Node* p=head->next;
        head->next=head->next->next;
        free(p);
    }
    free(head);
}

/*菜单栏*/
int menu() {
    int choice;
    printf("\n");
    printf("╔════════════════════════════════════════╗\n");
    printf("║           车辆违章记录管理系统         ║\n");
    printf("╠════════════════════════════════════════╣\n");
    printf("║  1. 查询违章记录                       ║\n");
    printf("║  2. 插入违章记录信息                   ║\n");
    printf("║  3. 删除违章信息                       ║\n");
    printf("║  4. 修改违章信息                       ║\n");
    printf("║  5. 数据统计分析                       ║\n");
    printf("║  6. 展示所有违章信息                   ║\n");
    printf("║  7. 保存到文件                         ║\n");
    printf("║  8. 退出系统                           ║\n");
    printf("╚════════════════════════════════════════╝\n");
    printf("请选择操作 (1-8): ");
    scanf("%d", &choice);
    return choice;
}
int main() {
    double min, max, newFine;
    int newScore;
    char num[20], name[SIZE], type[20], newSituation[SIZE];
    int subChoice;
    InitLink("record.txt");
    while (1) {
        int choice = menu();
        if (choice == 8) break;

        switch (choice) {
        case 1: 
            printf("\n===== 查询方式 =====\n");
            printf("1. 按车牌号查询\n2. 按车主姓名查询\n3. 按违章类型查询\n4. 按罚款金额区间查询\n");
            printf("请选择: ");
            scanf("%d", &subChoice);
            getchar();

            if (subChoice == 1) {
                printf("请输入车牌号: ");
                fgets(num,20,stdin);
                num[strcspn(num,"\n")]='\0';
                SearchByNum(num);
            }
            else if (subChoice == 2) {
                while(getchar()!='\n');
                printf("请输入车主姓名: ");
                fgets(name,SIZE,stdin);
                name[strcspn(name,"\n")]='\0';
                SearchByName(name);
            }
            else if (subChoice == 3) {
                while(getchar()!='\n');
                printf("请输入违章类型: ");
                fgets(type,20,stdin);
                type[strcspn(type,"\n")]='\0';
                SearchByType(type);
            }
            else if (subChoice == 4) {
                printf("请输入罚款金额最小值: ");
                scanf("%lf", &min);
                printf("请输入罚款金额最大值: ");
                scanf("%lf", &max);
                SearchByFine(min, max);
            }
            else printf("输入无效\n");
            break;

        case 2:
            Insert();
            break;

        case 3:
        while(getchar()!='\n');
            printf("请输入要删除的车牌号: ");
            fgets(num,20,stdin);
            num[strcspn(num,"\n")]='\0';
            Delete(num);
            break;

        case 4: 
            printf("\n===== 修改内容 =====\n");
            printf("1. 修改扣分\n2. 修改罚款金额\n3. 修改处理状态\n");
            printf("请选择: ");
            scanf("%d", &subChoice);
            getchar();
            printf("请输入目标车牌号: ");
            fgets(num,20,stdin);
            num[strcspn(num,"\n")]='\0';

            if (subChoice == 1) {
                printf("请输入新的扣分数值: ");
                scanf("%d", &newScore);
                getchar();
                ChangeScore(num, newScore);
            }
            else if (subChoice == 2) {
                printf("请输入新的罚款金额: ");
                scanf("%lf", &newFine);
                getchar();
                ChangeFine(num, newFine);
            }
            else if(subChoice == 3) {
                printf("请输入新的处理状态(0未处理/1已处理): ");
                scanf("%s", newSituation);
                getchar();
                ChangeSituation(num, newSituation);
            }
            break;

        case 5: 
            printf("\n===== 统计功能 =====\n");
            printf("1. 各违章类型发生次数\n2. 未处理违章条数与总罚款\n3. 指定车牌总扣分\n");
            printf("请选择: ");
            scanf("%d", &subChoice);
            getchar();

            if (subChoice == 1) {
                char types[100][20];
                int typeCount[100], typeNum;
                CountViolationTypes(head, types, typeCount, &typeNum);
                printf("\n违章类型统计:\n");
                for (int i = 0; i < typeNum; i++) {
                    printf("%s : %d次\n", types[i], typeCount[i]);
                }
            }
            else if (subChoice == 2) {
                int unDealNum;
                double totalFine;
                CountUnprocessed(head, &unDealNum, &totalFine);
                printf("\n未处理违章条数: %d\n未处理总罚款: %.2lf元\n", unDealNum, totalFine);
            }
            else if(subChoice == 3) {
                printf("请输入车牌号: ");
                fgets(num,20,stdin);
                num[strcspn(num,"\n")]='\0';
                int sum = CountScoreByNum(head, num);
                printf("\n车牌%s 累计总扣分: %d分\n", num, sum);
            }
            break;

        case 6:
            Show();
            break;

        case 7:
            SaveFile("record.txt");
            printf("保存成功\n");
            break;

        default:
            break;
        }
        system("pause");
        system("cls");
    }
    Destroy();
    printf("已退出系统\n");
    return 0;
}