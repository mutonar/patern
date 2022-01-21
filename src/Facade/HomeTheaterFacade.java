/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;


/**
 *
 * @author nazarov
 */
public class HomeTheaterFacade {
    
    DvdPlayer dvd;        
    Screen screen;
    PopcornPopper popper;
 
    public HomeTheaterFacade(
                 DvdPlayer dvd, 
                 Screen screen,
                 PopcornPopper popper) {
 
        this.dvd = dvd;
        this.screen = screen;
        this.popper = popper;
    }
 
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        screen.down();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println(
        "Shutting movie theater down...");
        popper.off();
        screen.up();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
