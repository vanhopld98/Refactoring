public class TennisGame {

    public static String getScore(String NamePlayer1, String NamePlayer2, int ScorePlayer1, int ScorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (ScorePlayer1 == ScorePlayer2) {
            score = Score1EqualScore2(ScorePlayer1);
        } else if (ScorePlayer1 >= 4 || ScorePlayer2 >= 4) {
            int minusResult = ScorePlayer1 - ScorePlayer2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = ScorePlayer1;
                else {
                    score += "-";
                    tempScore = ScorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String Score1EqualScore2(int ScorePlayer1) {
        String score;
        switch (ScorePlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}