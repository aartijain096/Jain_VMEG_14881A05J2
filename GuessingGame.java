class GuessingGame {
    public int answer;
    public int min;
    public int max;
   
    public GuessingGame(int min, int max) {
     Random r=new Random();
     answer=r.nextInt((max-min)+1)+min; 
     game.guess();
    }

    public int guess() {
        int guess;
        do
        {
        Scanner s=new Scanner(System.in);
        guess=s.nextInt();
        if(guess<answer)
        game.higher();
        else if(guess>answer)
        game.lower();
        else
        System.out.println(guess+" -Bingo!");
        }while(guess!=answer);
        return 0;
    }

    public void lower() {
     System.out.println("enter a lower value!");
    }

    public void higher() {
     System.out.println("enter a higher value!");
    }
}
