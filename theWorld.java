import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class theWorld extends World
{
    boolean reveal=false;
    private static int level=1;
    private int timer=100;
    /**
     * Constructor for objects of class theWorld.
     * 
     */
    public theWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1, false);
        level=1;
        Greenfoot.setWorld(new Title());
        prepare();

    }

    public boolean toggleFakeBlock(){
        if (reveal==false){
            reveal=true;
        }else{
            reveal=false;
        }
        return reveal;
    }

    public void started(){
    }

    public void act(){
        if(level==10){
            timer--;
            if(timer==0){
                addObject(new Rocket(Greenfoot.getRandomNumber(5)+5),700,Greenfoot.getRandomNumber(400));
                timer=50;
            }
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        Hippo hippo = new Hippo();
        addObject(hippo, 410, 164);
        Block block = new Block();
        addObject(block, 420, 253);
        Block block2 = new Block();
        addObject(block2, 481, 196);
        Block block3 = new Block();
        addObject(block3, 363, 197);
        block3.setLocation(29, 371);
        block.setLocation(86, 371);
        block2.setLocation(143, 371);
        hippo.setLocation(17, 281);
        hippo.setLocation(82, 316);
        Block block4 = new Block();
        addObject(block4, 27, 314);
        block4.setLocation(29, 313);
        Block block5 = new Block();
        addObject(block5, 29, 255);
        Block block6 = new Block();
        addObject(block6, 29, 196);
        Block block7 = new Block();
        addObject(block7, 187, 312);
        Block block8 = new Block();
        addObject(block8, 231, 371);
        Block block9 = new Block();
        addObject(block9, 290, 340);
        Block block10 = new Block();
        addObject(block10, 350, 294);
        Spike spike = new Spike();
        addObject(spike, 195, 270);
        spike.setLocation(197, 267);
        hippo.setLocation(95, 240);
        FakeBlock fakeblock = new FakeBlock();
        addObject(fakeblock, 408, 260);
        Spike spike2 = new Spike();
        addObject(spike2, 280, 303);
        Spike spike3 = new Spike();
        addObject(spike3, 305, 302);
        spike2.setLocation(275, 295);
        spike3.setLocation(303, 295);
        fakeblock.setLocation(445, 329);
        Block block11 = new Block();
        addObject(block11, 552, 296);
        fakeblock.setLocation(494, 302);
        fakeblock.setLocation(494, 296);
        fakeblock.setLocation(494, 355);
        block11.setLocation(519, 292);
        fakeblock.setLocation(459, 352);
        fakeblock.setLocation(436, 293);
        Block block12 = new Block();
        addObject(block12, 583, 264);
        block12.setLocation(576, 261);
        Block block13 = new Block();
        addObject(block13, 576, 204);
        RedGun redgun = new RedGun();
        addObject(redgun, 361, 88);
        FakeBlock fakeblock2 = new FakeBlock();
        addObject(fakeblock2, 636, 204);
        fakeblock2.setLocation(634, 204);
        redgun.setLocation(588, 68);
        block10.setLocation(378, 293);
        block10.setLocation(363, 294);
        redgun.setLocation(271, 176);
        Block block14 = new Block();
        addObject(block14, 513, 111);
        Spike spike4 = new Spike();
        addObject(spike4, 591, 160);
        block14.setLocation(411, 120);
        fakeblock2.setLocation(468, 120);
        redgun.setLocation(340, 177);
        Block block15 = new Block();
        addObject(block15, 353, 121);
        block15.setLocation(353, 120);
        Block block16 = new Block();
        addObject(block16, 297, 121);
        Block block17 = new Block();
        addObject(block17, 226, 116);
        block16.setLocation(295, 120);
        block17.setLocation(178, 122);
        FakeBlock fakeblock3 = new FakeBlock();
        addObject(fakeblock3, 237, 122);
        fakeblock3.setLocation(237, 120);
        block17.setLocation(180, 120);
        block16.setLocation(295, 76);
        fakeblock3.setLocation(238, 76);
        block17.setLocation(180, 76);
        redgun.setLocation(332, 162);
        redgun.setLocation(334, 163);
        block10.setLocation(366, 340);
        fakeblock.setLocation(445, 340);
        block15.setLocation(496, 192);
        fakeblock2.setLocation(353, 120);
        block15.setLocation(477, 131);
        block15.setLocation(468, 120);
        DeathNumber deathnumber = new DeathNumber();
        addObject(deathnumber, 78, 53);
        Finish finish = new Finish();
        addObject(finish, 177, 19);
        spike.setLocation(201, 267);
        spike4.setLocation(590, 159);
        hippo.setLocation(92, 322);
        finish.setLocation(180, 21);
        LvText lvtext = new LvText();
        addObject(lvtext, 79, 25);
        fakeblock3.setLocation(236, 206);
        removeObject(fakeblock3);
        Block block18 = new Block();
        addObject(block18, 237, 76);
        finish.setLocation(180, 29);
        redgun.setLocation(302, 163);
        Block block19 = new Block();
        addObject(block19, 637, 146);
        block19.setLocation(635, 145);
        Block block20 = new Block();
        addObject(block20, 636, 87);
        block20.setLocation(635, 87);
        Block block21 = new Block();
        addObject(block21, 636, 30);
        block21.setLocation(635, 29);
        Block block22 = new Block();
        addObject(block22, 29, 138);
        deathnumber.setLocation(578, 386);
        lvtext.setLocation(79, 25);
        lvtext.setLocation(596, 312);
        Message message = new Message();
        addObject(message, 578, 350);
        message.setLocation(590, 350);
        deathnumber.setLocation(605, 383);
        redgun.setLocation(296, 164);
        block10.setLocation(348, 340);
        Spike spike5 = new Spike();
        addObject(spike5, 454, 77);
        spike5.setLocation(454, 75);
        Spike spike6 = new Spike();
        addObject(spike6, 427, 76);
        spike6.setLocation(425, 74);
        spike6.setLocation(424, 75);
        Spike spike7 = new Spike();
        addObject(spike7, 280, 32);
        spike7.setLocation(280, 31);
        block2.setLocation(143, 371);
        block2.setLocation(143, 371);
        block2.setLocation(143, 396);
        block.setLocation(86, 396);
        block8.setLocation(231, 396);
        block7.setLocation(187, 339);
        spike.setLocation(200, 294);
        block9.setLocation(290, 363);
        block10.setLocation(348, 363);
        block11.setLocation(505, 310);
        block12.setLocation(563, 267);
        block13.setLocation(563, 211);
        spike4.setLocation(579, 166);
        block19.setLocation(621, 153);
        block20.setLocation(621, 94);
        block21.setLocation(621, 37);
        block15.setLocation(472, 180);
        block14.setLocation(413, 121);
        block15.setLocation(473, 128);
        redgun.setLocation(298, 180);
        block15.setLocation(473, 134);
        block14.setLocation(416, 134);
        spike5.setLocation(458, 90);
        spike6.setLocation(430, 89);
        spike5.setLocation(458, 90);
        spike5.setLocation(459, 89);
        block16.setLocation(292, 135);
        fakeblock2.setLocation(356, 134);
        block16.setLocation(297, 133);
        block18.setLocation(239, 133);
        block17.setLocation(181, 133);
        finish.setLocation(89, 88);
        Block block23 = new Block();
        addObject(block23, 29, 80);
        Block block24 = new Block();
        addObject(block24, 29, 20);
        block24.setLocation(29, 23);
        Block block25 = new Block();
        addObject(block25, 88, 135);
        block25.setLocation(86, 135);
        finish.setLocation(87, 86);
        spike7.setLocation(281, 88);
        removeObject(block17);
        FakeBlock fakeblock4 = new FakeBlock();
        addObject(fakeblock4, 181, 134);
        fakeblock4.setLocation(179, 133);
        fakeblock4.setLocation(146, 135);
        spike2.setLocation(274, 318);
        spike3.setLocation(302, 317);
        spike3.setLocation(302, 318);
        fakeblock2.setLocation(356, 134);
        block16.setLocation(298, 134);
        block18.setLocation(241, 134);
        spike7.setLocation(283, 89);
        fakeblock4.setLocation(145, 135);
        fakeblock2.setLocation(358, 134);
        block16.setLocation(300, 134);
        block18.setLocation(242, 134);
        fakeblock4.setLocation(144, 135);
        block11.setLocation(505, 301);
        spike7.setLocation(256, 89);
        block16.setLocation(355, 63);
        fakeblock2.setLocation(299, 134);
        block16.setLocation(359, 134);
        fakeblock2.setLocation(301, 134);
        block18.setLocation(243, 134);
        spike7.setLocation(257, 65);
        block18.setLocation(242, 110);
        block18.setLocation(241, 135);
        spike7.setLocation(256, 90);
        block18.setLocation(241, 134);
        spike7.setLocation(255, 89);
        hippo.setLocation(85, 347);
        message.setLocation(319, 24);
        block18.setLocation(244, 134);
        spike7.setLocation(258, 89);
        redgun.setLocation(299, 177);
        finish.setLocation(88, 59);
        block25.setLocation(87, 108);
        fakeblock4.setLocation(144, 108);
        removeObject(spike2);
    }

    public static int lv(){
        return level;
    }

    public static void lvup(){
        level++;

    }

    public void cheat(int l){
        level=l;
    }
}
