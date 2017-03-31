package makArray;

public class MakkArray {

	void  makDegerBul(){
	
		int[]array ={3233,452,456};
		int max = array[0];
		for(int i=0; i<array.length; i++){
			if(array[i] > max){
   max = array[i];
               }
		}
	System.out.println("En Büyük Sayý:"+max);
	}
}
