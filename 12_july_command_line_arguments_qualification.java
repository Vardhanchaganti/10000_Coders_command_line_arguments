class command_line_arguments_qualification{
	public static void main(String[] args){
		System.out.print("Name : ");
		System.out.println(args[0]);
		System.out.print("Highest Degree : ");
		System.out.println(args[1]);
		System.out.print("Specialization : ");
		System.out.println(args[2]);
		System.out.print("College Name : ");
		System.out.println(args[3]);
		if(args.length==5){
			System.out.print("C.G.P.A : ");
			System.out.println(args[4]);
		}	
	}
}