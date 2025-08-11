// Last updated: 12/08/2025, 00:14:40
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map=new HashMap<>();
        for(int ar=0;ar<paths.size();ar++){
            map.put(paths.get(ar).get(0),paths.get(ar).get(1));
        }

        String city=paths.get(0).get(0);
        while(map.containsKey(city)){
            city=map.get(city);
        }

        return city;
    }
}