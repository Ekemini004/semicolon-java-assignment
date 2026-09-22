public class Fibonnacci {
public static void main(String [] args){
int indexOne = 0;
int indexTwo = 1;
int next = 0;
for(int counter = 0; counter < 10; counter++ ){
System.out.println(indexOne + ",");
int indexThree = indexOne + indexTwo;
indexOne = indexTwo;
indexTwo = next;
}

}


}
