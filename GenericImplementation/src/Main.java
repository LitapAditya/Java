public class Main
{
    public static void main(String[] args)
    {
        FootballPlayer footballPlayer1 = new FootballPlayer("Q");
        FootballPlayer footballPlayer2 = new FootballPlayer("G");
        FootballPlayer footballPlayer3 = new FootballPlayer("M");

        PoolPlayer poolPlayer1 = new PoolPlayer("POOL PLAYER 1");
        PoolPlayer poolPlayer2 = new PoolPlayer("POOL PLAYER 2");
        PoolPlayer poolPlayer3 = new PoolPlayer("POOL PLAYER 3");

        GolfPlayer golfPlayer1 = new GolfPlayer("GOLF PLAYER 1");
        GolfPlayer golfPlayer2 = new GolfPlayer("GOLF PLAYER 2");
        GolfPlayer golfPlayer3 = new GolfPlayer("GOLF PLAYER 3");

        Team<FootballPlayer> footballPlayerTeam = new Team<>();
        footballPlayerTeam.addPlayer(footballPlayer1);
        footballPlayerTeam.addPlayer(footballPlayer2);
        footballPlayerTeam.addPlayer(footballPlayer3);

        System.out.println(footballPlayerTeam);
    }
}