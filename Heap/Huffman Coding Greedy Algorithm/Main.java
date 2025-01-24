public class Main {
    public static void main(String[] args) throws Exception {
        // We can use Bitset: it is like an array but whith a bit at each index
        String str = "abbccda";

        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);

        String ds = hf.decode(cs);
        System.out.println(ds);
    }
}
