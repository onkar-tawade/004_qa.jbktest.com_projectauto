package DataProvider;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		s.push(11);
		s.push(121);
		s.push(1);
		s.push(15554);
		s.pop();
		System.out.println(s.peek());
		
		List<Integer> list = new LinkedList();
		
		Queue<Integer> que = new PriorityQueue();
		que.offer(100);
		que.offer(-200000);
		que.offer(70);

		que.offer(3000);

		System.out.println(que);
	    que.poll();
		System.out.println(que);

	}
	
}
