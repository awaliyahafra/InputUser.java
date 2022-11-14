public class jawabanb {
    public static void UbahHurufEToStar(String[] args){
        for (int index=0; index<args.length; index++){
            System.out.println(args[index].replace("e","*"));
        }
    }
    public static void main(String[] args) {
        String[]_block = new String[]{"Triangle","cubes","cirxle"};
        UbahHurufEToStar(_block);
    }
}
