public class OOPSBannerUC7 {

    // Static Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        String[] Opattern = O.getPattern();
        String[] Ppattern = P.getPattern();
        String[] Spattern = S.getPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(
                Opattern[i] + "   " +
                Opattern[i] + "   " +
                Ppattern[i] + "   " +
                Spattern[i]
            );
        }
    }
}
