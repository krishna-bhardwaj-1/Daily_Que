// Last updated: 12/08/2025, 00:17:27
public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb=new StringBuilder();
        for(char ch:longUrl.toCharArray()){
            sb.append((char)(ch+1));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb=new StringBuilder();
        for(char ch:shortUrl.toCharArray()){
            sb.append((char)(ch-1));
        }
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));