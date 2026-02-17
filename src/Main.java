public class Main {
    public static void main (String[] args){
        InstaAccount instaAccount = new InstaAccount("Senanur " , "senanurknt ",190 );
        try {
            instaAccount.increaseFollowers(50);
            instaAccount.decreaseFollowers(-20);


        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }


    }
}