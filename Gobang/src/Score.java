import java.util.HashMap;
import java.util.Set;

public class Score {
    private static  HashMap<String,Integer> map=new HashMap<>();
    Score(){
        int score=7;
//        //二连
//        //被堵住
//        map.put("02",score);
//        map.put("002",score);
//        map.put("021",score);
//        map.put("0002",score);
//        map.put("0021",score);
//        map.put("0210",score);
//        map.put("0211",score);
//        map.put("00021",score);
//        map.put("00211",score);
//        map.put("02111",score);
//        //未堵住
//        score=27;
//        map.put("020",score);
//        map.put("0200",score);
//        map.put("0020",score);
//        map.put("0201",score);
//        map.put("00002",score);
//        map.put("00020",score);
//        map.put("00201",score);
//        map.put("00200",score);
//        map.put("02000",score);
//        map.put("02001",score);
//        map.put("02010",score);
//        map.put("02011",score);
//
//        //三连
//        //堵住
//        score=55;
//        map.put("022",score);
//        map.put("0221",score);
//        map.put("0202",score);
//        map.put("0022",score);
//        map.put("02221",score);
//        map.put("02211",score);
//        map.put("02210",score);
//        map.put("00202",score);
//        map.put("02021",score);
//        //未堵住
//        score=150;
//        map.put("00220",score);
//        map.put("02200",score);
//        map.put("02201",score);
//        map.put("02020",score);
//        map.put("00022",score);
//
//        //四连
//        //堵住
//        map.put("02221",score);
//        map.put("02022",score);
//        map.put("02202",score);
//        //未堵住
//        map.put("02220",score);
//        map.put("00222",score);
//
//        //五连
//        map.put("02222",score);

        //被堵住
        //被堵住
        map.put("01", 25);//眠1连
        map.put("02", 22);//眠1连
        map.put("001", 17);//眠1连
        map.put("002", 12);//眠1连
        map.put("0001", 17);//眠1连
        map.put("0002", 12);//眠1连

        map.put("0102",25);//眠1连，15
        map.put("0201",22);//眠1连，10
        map.put("0012",15);//眠1连，15
        map.put("0021",10);//眠1连，10
        map.put("01002",25);//眠1连，15
        map.put("02001",22);//眠1连，10
        map.put("00102",17);//眠1连，15
        map.put("00201",12);//眠1连，10
        map.put("00012",15);//眠1连，15
        map.put("00021",10);//眠1连，10

        map.put("01000",25);//活1连，15
        map.put("02000",22);//活1连，10
        map.put("00100",19);//活1连，15
        map.put("00200",14);//活1连，10
        map.put("00010",17);//活1连，15
        map.put("00020",12);//活1连，10
        map.put("00001",15);//活1连，15
        map.put("00002",10);//活1连，10

        //被墙堵住
        map.put("0101",65);//眠2连，40
        map.put("0202",60);//眠2连，30
        map.put("0110",80);//眠2连，40
        map.put("0220",76);//眠2连，30
        map.put("011",80);//眠2连，40
        map.put("022",76);//眠2连，30
        map.put("0011",65);//眠2连，40
        map.put("0022",60);//眠2连，30

        map.put("01012",65);//眠2连，40
        map.put("02021",60);//眠2连，30
        map.put("01102",80);//眠2连，40
        map.put("02201",76);//眠2连，30
        map.put("01120",80);//眠2连，40
        map.put("02210",76);//眠2连，30
        map.put("00112",65);//眠2连，40
        map.put("00221",60);//眠2连，30

        map.put("01100",80);//活2连，40
        map.put("02200",76);//活2连，30
        map.put("01010",75);//活2连，40
        map.put("02020",70);//活2连，30
        map.put("00110",75);//活2连，40
        map.put("00220",70);//活2连，30
        map.put("00011",75);//活2连，40
        map.put("00022",70);//活2连，30

        //被堵住
        map.put("0111",150);//眠3连，100
        map.put("0222",140);//眠3连，80

        map.put("01112",150);//眠3连，100
        map.put("02221",140);//眠3连，80

        map.put("01110", 1100);//活3连
        map.put("02220", 1050);//活3连
        map.put("01101",1000);//活3连，130
        map.put("02202",800);//活3连，110
        map.put("01011",1000);//活3连，130
        map.put("02022",800);//活3连，110

        map.put("01111",3000);//4连，300
        map.put("02222",3500);//4连，280

    }
    public int match(String Pattern){
        Set<String> key=  map.keySet();
        for (String s : key) {
            if (s.equals(Pattern)){
                return map.get(s);
            }
        }
        return 0;
    }
}
