package ss8_clean_code_refactoring;


    public class TennisGame {

        public static String getScore(String firstPlayer, String secondPlayer, int firstPlayerScore, int secondPlayerScore) {
            String score = "";
            int tempScore = 0;
            if (firstPlayerScore == secondPlayerScore) {
                score = getEqualScores(firstPlayerScore);

            } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
                score = getAdvantageOrWinScore(firstPlayerScore, secondPlayerScore);
            } else {
                score = getRegularScore(firstPlayerScore, secondPlayerScore);
            }

            return score;
        }

        public static String getAdvantageOrWinScore(int firstScore, int secondScore) {
            int minusResult = firstScore - secondScore;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            else return "Win for player2";
        }

        public static String getEqualScores(int score) {
            return switch (score) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            };
        }

        public static String getRegularScore(int firstScore, int secondScore) {
            String score = "";
            for (int i = 1; i < 3; i++) {
                int tempScore = (i == 1) ? firstScore : secondScore;
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
                if (i == 1) {
                    score += "-";
                }
            }
            return score;
        }
    }
