package JavaStudy.Practice;

import java.util.*;

/**
 * @Author Meng Xin
 * @Date 2020/7/23 7:27
 */
public class practice0723 {
    public static int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if (len < 1) {
            return 0;
        }
        int count = 0;
        Arrays.sort(array);
        int num = array[len / 2];
        for (int i = 0; i < len; i++) {
            if (num == array[i])
                count++;
        }
        if (count <= (len / 2)) {
            num = 0;
        }
        return num;
    }

    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap而不是hashmap！！！！！
        String key;
        String filename;
        String path;
        while (in.hasNext()) {
            path = in.next();
            //将路径转换为文件名
            int id = path.lastIndexOf('\\');
            //如果找不到说明只有文件名没有路径
            filename = id < 0 ? path : path.substring(id + 1);
            int linenum = in.nextInt();
            //统计频率
            key = filename + " " + linenum;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        in.close();

        //对记录进行排序
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            //降序
            @Override
            public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                return (arg1.getValue() - arg0.getValue()) == 0 ? (arg0.getValue() - arg1.getValue()) : (arg1.getValue() - arg0.getValue());
            }
        });
        //只输出前8条
        int m = 0;
        for (Map.Entry<String, Integer> mapping : list) {
            m++;
            if (m <= 8) {
                String[] str = mapping.getKey().split(" ");
                String k = str[0].length() > 16 ? str[0].substring(str[0].length() - 16) : str[0];
                String n = str[1];
                System.out.println(k + " " + n + " " + mapping.getValue());
            } else {
                break;
            }

        }

    }
}
