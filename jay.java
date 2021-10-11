package jayu;

import java.util.Arrays;
import java.util.List;

public class jay {
	public static void main(String[] args)
	{
	List<Integer> list = (List<Integer>) Arrays.asList(2, 4, 6, 8, 10);
long total=list.stream().count();
	System.out.println(total);
}
}


