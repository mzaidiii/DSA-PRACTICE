class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap < String , List<String> > map = new HashMap<>();

        for (int i =0 ; i< strs.length ; i++){
            char [] chars = strs[i].toCharArray();
            List<String> temp1 = new ArrayList<>();
            Arrays.sort(chars);
            String temp = new String(chars);
            if (map.containsKey(temp)){
                temp1 = map.get(temp);
                temp1.add(strs[i]);
                map.put(temp , temp1);
            }else{
                temp1.add(strs[i]);
                map.put(temp , temp1);
            }
        }

        ans = new ArrayList<>(map.values());
        return ans ;
    }
}