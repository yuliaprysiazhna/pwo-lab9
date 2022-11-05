package pwo.lab09.builder;

public class _run {

    public static void main(String[] args) {
        TxtPic1 txtPic = new TxtPic1('.', '*', 20, "txtpic1.txt");
        txtPic.save();

        TxtPic2 txtPic2 = new TxtPic2();

        txtPic2
                .setBackground('_')
                .setForeground('*')
                .setSize(20)
                .setFileName("txtpic2.txt")
                .createTxtPic()
                .save();
        
        TxtPic3 txtPic3 = new TxtPic3();
        txtPic3
                .setSize(25)
                .setFileName("")
                .createTxtPic()
                .save();
    }
}