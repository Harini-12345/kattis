/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * Apr 25 18
 */

import java.io.*;
import java.util.*;

public class faktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int articles = in.nextInt();
		int faktor = in.nextInt();
		System.out.println(articles * faktor - (articles - 1));
	}

}