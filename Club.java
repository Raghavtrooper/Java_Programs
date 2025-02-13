class Club {
    static String clubName = "basketball club";
    private String memberName;

    public Club(String memberName) {
        this.memberName = memberName;
    }

    public static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberDetails() {
        System.out.println("Club Name: " + clubName + ",Member Name: " + memberName);
    }

    public static void main(String[] args) {
        Club.displayClubName();

        Club member1 = new Club("Ali");
        Club member2 = new Club("prabh");
        Club member3 = new Club("suresh");

        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();

        Club.clubName = "chess club";

        System.out.println("\nAfter changing the club name:");

        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
    }
}
