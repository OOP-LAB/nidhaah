
import java.util.Scanner;
class Addition
{
public static void main(String[] args)
{
int row,col,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of rows:");
row=in.nextInt();
System.out.println("enter the number of coloumns:");
col=in.nextInt();
int Mat[][]=new int[row][col];
int Matrix[][]=new int[row][col];
System.out.println("enter the values");
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Mat[i][j]=in.nextInt();
int Mat1[][]=new int[row][col];
System.out.println("enter the values");
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Mat1[i][j]=in.nextInt();
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Matrix[i][j]=Mat[i][j]+Mat1[i][j];
for(i=0;i<row;i++)
{
System.out.print("\n");
for(j=0;j<col;j++)
System.out.print("\t"+Matrix[i][j]);
}
}
}
