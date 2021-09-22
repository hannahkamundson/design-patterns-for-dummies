package patterns.facade.product;

public class DifficultProduct {
    char nameChars[] = new char[7];

    public void setFirstNameCharacter(char c) {
        this.nameChars[0] = c;
    }

    public void setSecondNameCharacter(char c) {
        this.nameChars[1] = c;
    }

    public void setThirdNameCharacter(char c) {
        this.nameChars[2] = c;
    }

    public void setFourthNameCharacter(char c) {
        this.nameChars[3] = c;
    }

    public void setFifthNameCharacter(char c) {
        this.nameChars[4] = c;
    }

    public void setSixthNameCharacter(char c) {
        this.nameChars[5] = c;
    }

    public void setSeventhNameCharacter(char c) {
        this.nameChars[6] = c;
    }

    public String getName() {
        return new String(nameChars);
    }
}
