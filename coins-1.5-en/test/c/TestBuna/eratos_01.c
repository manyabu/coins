/* Eratosthenes   */
   /* print count */ 
int scanf(char *s, ...);
int printf(char *s, ...);
/*int exit( int a); */

int main() {
    int Max=100;
    int n;
    int count=0;
    int flag[101];
    int i,j;

    scanf("%d", &n);
/*    if (n>Max) */
/*      exit(0); */
      
    for (i=0;i<n+1;i++)
        flag[i]=1;  
    flag[0]=0; 
    flag[1]=0; 
    for (i=2;i<n+1;i++){
       if (flag[i]==1){
          for (j=2*i;j<n+1;j=j+i){
            flag[j]=0;
          }
          count++;
       }
     }
     printf("count = %d\n", count);
     return 0;
}
