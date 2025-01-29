import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Heap {
    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        String[] moves = new String[n];
        for(int i =0; i<n; i++){
            moves[i] = b.readLine();
        }
        b.close();

        int steps = 0;
        int p = 0;
        String[] position = new String[2];
        position[0] = moves[0];
        position[1] = moves[1];

        for(String s : moves){
            if(position[0].equals(s) || position[1].equals(s)){
                continue;
            }
            else{
                position[p] = s;
                steps++;
                if(p==0)
                    p = 1;
                else
                    p = 0;
            }
        }
        System.out.println(steps);
    }
}