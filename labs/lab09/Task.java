public class Task {
    public static void main(String[] args) {
        Question sampleQuestion = new Question("Is KFUPM the best university ever? ");
        System.out.println(sampleQuestion);

        System.out.println();

        MCQuestion sampleMcQuestion = new MCQuestion("Is potato better than banana? ", new String[] { "True", "False" });
        System.out.println(sampleMcQuestion);
    }
}
