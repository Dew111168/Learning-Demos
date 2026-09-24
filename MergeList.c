//合并两个有序表
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define LIST_INIT_SIZE 100
#define LISTINCREMENT 10
#define OK 1
#define ERROR 0
typedef int Status;
typedef int ElemType;
// 自定义结构体
typedef struct{
    ElemType *elem;
    int length;
    int listsize;
}SqList;
// 往数字里边读入数据
void ReadArr(SqList *LA,SqList *LB){
        scanf("%d",&LA->length);
        for(int i=0;i<LA->length;i++){
            scanf("%d",&LA->elem[i]);
        }
        scanf("%d",&LB->length);
        for(int i=0;i<LB->length;i++){
            scanf("%d",&LB->elem[i]);
        }
}
// 定义一个空表并初始化
Status InitSqList(SqList *L){
    L->elem=(ElemType*)malloc(LIST_INIT_SIZE*sizeof(ElemType));
    if(!L->elem) exit(-1);
    L->length=0;
    L->listsize=LIST_INIT_SIZE;
    return OK;
}
// 打印顺序表
void  PrintSqList(SqList *L){
    for(int i=0;i<L->length;i++){
        printf("%d ",L->elem[i]);
    }
    printf("\n");
}
// 销毁表
void DestroySqList(SqList*L){
    free(L->elem);
    L->elem=NULL;
    L->length=0;
    L->listsize=0;
}
// 合并
void MergeList_Sq(SqList LA,SqList LB,SqList *LC){
    ElemType *pa,*pb,*pc;
    ElemType *pa_last,*pb_last;
    pa=LA.elem;
    pb=LB.elem;
    LC->length=LA.length+LB.length;
    LC->listsize=LC->length;

    LC->elem=(ElemType* )malloc(LC->listsize*sizeof(ElemType));
    if(!LC->elem) exit(-1);
    pc=LC->elem;
    pa_last=LA.elem+LA.length-1;
    pb_last=LB.elem+LB.length-1;

    while(pa<=pa_last&&pb<=pb_last){
        if(*pa<=*pb){
            *pc=*pa;
            pc++;
            pa++;
        }else{
            *pc=*pb;
            pc++;
            pb++;
        }
    }
    while(pa<=pa_last){
        *pc=*pa;
        pc++;
        pa++;
    }
    while(pb<=pb_last){
        *pc=*pb;
        pc++;
        pb++;
    }
}

int main(){
    SqList LA,LB,LC;
    InitSqList(&LA);
    InitSqList(&LB);
    InitSqList(&LC);

    ReadArr(&LA,&LB);
    MergeList_Sq(LA,LB,&LC);
    PrintSqList(&LA);
    PrintSqList(&LB);
    PrintSqList(&LC);

    DestroySqList(&LA);
    DestroySqList(&LB);
    DestroySqList(&LC);
    return 0;
}
