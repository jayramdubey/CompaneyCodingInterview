package sapient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solutions {

	// Complete the maxTickets function below.
	static int maxTickets(List<Integer> tickets) {
	       Map<Integer,Integer> map = new HashMap<>();
	        int result = 1;
	        int tmp = 1;
	        int n;
	        Collections.sort(tickets);
	        for(int i = 0;i<tickets.size();i++) {
	            n = tickets.get(i);
	            if(map.containsKey(n-1) || map.containsKey(n)) {
	                tmp++;
	                result = Math.max(result, tmp);
	                map.put(n, i);
	            }else {
	                map.put(n, i);
	                tmp=1;
	            }
	        }
	        return result;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int ticketsCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> tickets = new ArrayList<>();

		for (int i = 0; i < ticketsCount; i++) {
			int ticketsItem = Integer.parseInt(bufferedReader.readLine().trim());
			tickets.add(ticketsItem);
		}

		int res = maxTickets(tickets);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
