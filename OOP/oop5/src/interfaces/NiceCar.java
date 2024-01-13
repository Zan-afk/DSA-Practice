package interfaces;

public class NiceCar {

    private Media player = new CDPlayer();
    private Engine engine;
    public NiceCar(){
        engine=new PowerEngin();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){

        this.engine = new ElectricEngine();
    }




}