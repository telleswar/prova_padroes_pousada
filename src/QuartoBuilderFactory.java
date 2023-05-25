public class QuartoBuilderFactory {
    public static QuartoBuilder create(QuartoType quartoType){
        if(quartoType.equals(QuartoType.Simples)){
            return new QuartoSimplesBuilder();
        }else if (quartoType.equals(QuartoType.Luxo)){
            return new QuartoLuxoBuilder();
        }
        return null;
    }
}
