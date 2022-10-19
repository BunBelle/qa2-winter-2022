import org.junit.jupiter.api.Test;

public class AllObjectsPractice {
    @Test
    public void workingWithChair() {
        Chair firstChair = new Chair();

        firstChair.setBackrestHeight(30);
        firstChair.setHeight(90);
        firstChair.setWeight(2);
        firstChair.setWidth(45);
        firstChair.setHeightOfLegs(40);

        System.out.println(firstChair.getBackrestHeight());
        System.out.println(firstChair.getHeight());
        System.out.println(firstChair.getHeightOfLegs());
        System.out.println(firstChair.getWidth());
        System.out.println(firstChair.getWeight());
    }

    public void workingWithCup() {
        Cup firstCup = new Cup();

        firstCup.setDepth(10);
        firstCup.setHeight(15);
        firstCup.setWeight(0.2);
        firstCup.setWidth(5);
        firstCup.setHandleLenght(5);

        System.out.println(firstCup.getDepth());
        System.out.println(firstCup.getHeight());
        System.out.println(firstCup.getWeight());
        System.out.println(firstCup.getWidth());
        System.out.println(firstCup.getHeight());
    }

    public void workingWithKnife() {
        Knife firstKnife = new Knife();

        firstKnife.setWeight(0.2);
        firstKnife.setBladeAngle(45);
        firstKnife.setBladeLength(90);
        firstKnife.setHandleLength(10);
        firstKnife.setWidthHandle(2);

        System.out.println(firstKnife.getBladeAngle());
        System.out.println(firstKnife.getBladeLength());
        System.out.println(firstKnife.getWeight());
        System.out.println(firstKnife.getHandleLength());
        System.out.println(firstKnife.getWidthHandle());
    }

    public void workingWithNotebook() {
        Notebook firstNotebook = new Notebook();

        firstNotebook.setHeight(25);
        firstNotebook.setWeight(0.4);
        firstNotebook.setWidth(35);
        firstNotebook.setPageCount(99);
        firstNotebook.setPageThickness(0.001);

        System.out.println(firstNotebook.getHeight());
        System.out.println(firstNotebook.getPageCount());
        System.out.println(firstNotebook.getPageThickness());
        System.out.println(firstNotebook.getWeight());
        System.out.println(firstNotebook.getWidth());
    }

    public void workingWithPackage() {
        Package firstPackage = new Package();

        firstPackage.setHandleLength(5);
        firstPackage.setLength(30);
        firstPackage.setWeight(0.1);
        firstPackage.setWidth(20);
        firstPackage.setHowManyHoles(1);

        System.out.println(firstPackage.getHandleLength());
        System.out.println(firstPackage.getLength());
        System.out.println(firstPackage.getHowManyHoles());
        System.out.println(firstPackage.getWeight());
        System.out.println(firstPackage.getWidth());
    }

    public void workingWithSink() {
        Sink firstSink = new Sink();

        firstSink.setDepth(15);
        firstSink.setHeight(25);
        firstSink.setHowManyHoles(3);
        firstSink.setWidth(45);
        firstSink.setWeight(10);

        System.out.println(firstSink.getDepth());
        System.out.println(firstSink.getHowManyHoles());
        System.out.println(firstSink.getHeight());
        System.out.println(firstSink.getWeight());
        System.out.println(firstSink.getWidth());
    }

    public void workingWithSponge() {
        Sponge firstSponge = new Sponge();

        firstSponge.setHeight(4);
        firstSponge.setWidth(2);
        firstSponge.setWeight(0.1);
        firstSponge.setWeightWithWater(0.3);
        firstSponge.setDegreeOfAngle(90);

        System.out.println(firstSponge.getDegreeOfAngle());
        System.out.println(firstSponge.getHeight());
        System.out.println(firstSponge.getWeightWithWater());
        System.out.println(firstSponge.getWidth());
        System.out.println(firstSponge.getWeight());
    }

    public void workingWithTable() {
        Table firstTable = new Table();

        firstTable.setHeightOfLegs(30);
        firstTable.setWeight(20);
        firstTable.setWidthOfLegs(6);
        firstTable.setTableTooWidth(60);
        firstTable.setTableTopHeight(6);

        System.out.println(firstTable.getHeightOfLegs());
        System.out.println(firstTable.getTableTooWidth());
        System.out.println(firstTable.getTableTopHeight());
        System.out.println(firstTable.getWeight());
        System.out.println(firstTable.getWidthOfLegs());
    }

    public void workingWithVase() {
        Vase firstVase = new Vase();

        firstVase.setDepth(20);
        firstVase.setHeight(30);
        firstVase.setThickness(3);
        firstVase.setVolume(5);
        firstVase.setWeight(3);

        System.out.println(firstVase.getDepth());
        System.out.println(firstVase.getThickness());
        System.out.println(firstVase.getHeight());
        System.out.println(firstVase.getVolume());
        System.out.println(firstVase.getWeight());
    }

    public void workingWithWindow() {
        Window firstWindow = new Window();

        firstWindow.setThickness(3);
        firstWindow.setHeight(100);
        firstWindow.setDegreeOfAngle(90);
        firstWindow.setWeight(5);
        firstWindow.setTransparency(100);

        System.out.println(firstWindow.getDegreeOfAngle());
        System.out.println(firstWindow.getThickness());
        System.out.println(firstWindow.getHeight());
        System.out.println(firstWindow.getTransparency());
        System.out.println(firstWindow.getWeight());
    }


}
