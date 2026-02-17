import java.util.Scanner;

public class InstaAccount
{
    private int followersCount ;
    public String username ;
    public String ownerName ;
    public InstaAccount (String username , String ownerName , int initialFollowers ){
        this.username= username;
        this.ownerName = ownerName ;
        this.followersCount = initialFollowers ;

    }
    public void increaseFollowers (int count ){
        if ( count <0 ){
            throw new IllegalArgumentException("geçersiz sayı ");


        }
        else {
            followersCount += count ;

        }

    }
    public void decreaseFollowers (int count ){
        if (count <0 || count > followersCount){
            throw new IllegalArgumentException("geçersiz sayı ");

        }else {

            followersCount -= count ;
        }

    }
    public int getFollowersCount () {

        return followersCount ;
    }



}
