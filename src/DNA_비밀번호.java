import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA_비밀번호 {
    public static void main(String[] args) throws IOException {
        //DNA문자열 길이, 부분문자열의 길이(window크기), startidx, dna 문자열 배열 초기화 , ACGT 개수 초기화 count 초기화
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int count =0;
        int strlen = Integer.parseInt(stringTokenizer.nextToken());
        int window = Integer.parseInt(stringTokenizer.nextToken());
        int sid = 0;
        int eid = sid + window -1;
        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        char[] arr = stringTokenizer.nextToken().toCharArray();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int Al = Integer.parseInt(stringTokenizer.nextToken());
        int Cl = Integer.parseInt(stringTokenizer.nextToken());
        int Gl = Integer.parseInt(stringTokenizer.nextToken());
        int Tl = Integer.parseInt(stringTokenizer.nextToken());


        //for (i = sid; sid+window-1 ; i++;)
        //   윈도우 내부 ACGT 개수 카운트
        for (int i = sid; i <= eid; i++) {
            if (arr[i] == 'A') A++;
            if (arr[i] == 'C') C++;
            if (arr[i] == 'G') G++;
            if (arr[i] == 'T') T++;
        }
        if(A>=Al && G>=Gl && C>=Cl && T>=Tl) count++;

        //while (sid + window - 1 !== DNA문자열 길이)
        //  sid++
        //  eid = sid+ window -1
        //  if arr[sid] == 'A' A--
        //  if arr[sid] == 'C' A--
        //  if arr[sid] == 'G' A--
        //  if arr[sid] == 'T' A--

        //  if arr[eid] == 'A' A++
        //  if arr[eid] == 'C' A--
        //  if arr[eid] == 'G' A--
        //  if arr[eid] == 'T' A--
        while (eid < strlen){

            if(arr[sid] == 'A') A--;
            if(arr[sid] == 'C') C--;
            if(arr[sid] == 'G') G--;
            if(arr[sid] == 'T') T--;

            sid++;
            eid++;

            if(arr[eid] == 'A') A++;
            if(arr[eid] == 'C') C++;
            if(arr[eid] == 'G') G++;
            if(arr[eid] == 'T') T++;

            if(A>=Al && G>=Gl && C>=Cl && T>=Tl) count++;


        }

        System.out.println(count);

        //  if A >= 2 && G>=1 && T >=1 count++



    }
}
