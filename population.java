class Population
{
	public static void main(String[] args)
	{
		int men,lit,litm,ilm,women,ilit,ilw,litw,tot;
		System.out.println("Total population in town: 80000 ");
		men = (int)(52.0*80000)/100;
		System.out.println("Total men in town: " + men);
		women = 80000 - men;
		System.out.println("Total women in town: " + women);
		lit = (int)(48.0*80000)/100;
		System.out.println("Total literate person in town: " + lit);
		ilit = 80000 - lit;
		System.out.println("Total illiterate person in town: " + ilit);
		litm = (int)(35.0*80000)/100;
		System.out.println("Total literate men in town: " + litm);
		litw = lit-litm;
		System.out.println("Total literate women in town: " + litw);
		ilm = men - litm;
		System.out.println("Total illiterate men in town: " + ilm);
		ilw = women - litw;
		System.out.println("Total illiterate women in town: " + ilw);
		tot = ilm+ilw;
		System.out.println("Total illiterate men and women in town: " + tot);
	}
}