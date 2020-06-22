/*	
  *****     *****
 *******   *******
********* *********
******SHAGUN*******
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/
class Star31{
	public static void main(String[] args){
		int row,col,star,space;
		star  = 5;
		space = 5;
		for(row = 1; row <= 3; row++){
			for(col = 1; col <= 3 - row; col++){
				System.out.print(" ");
			}
			for(col = 1; col <= star; col++){
				System.out.print("*");
			}	
			for(col = 1; col <= space; col++){
				System.out.print(" ");
			}
			for(col = 1; col <= star; col++){
				System.out.print("*");
			}
			star += 2;
			space -= 2;
			System.out.println();
		}
		star = 19;
		space = 0;
		String name = "SHAGUN";
		for( row = 1 ; row <= 10; row++ ){
			for(col = 1; col <= space; col++){
				System.out.print(" ");
			}
			if(row == 1 ){
				for(col = 1; col <= star ; col ++){
					if(col == 7 ){
						System.out.print(name);
					}if(col < 7 || col >= 13){
						System.out.print("*");
					}
					else{
						System.out.print("");
					}
				}
			}
			else{	
				for(col = 1; col <= star ; col ++){
					System.out.print("*");
				}
			}
			space++;
			star -= 2;
			System.out.println();
		}
	}
}
