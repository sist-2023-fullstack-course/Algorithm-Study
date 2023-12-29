public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		Set<Integer> set=new TreeSet<Integer>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<num; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
	}
	
}