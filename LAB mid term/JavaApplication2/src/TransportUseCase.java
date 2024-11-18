/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */

abstract class TransportUseCase {
    String name;
    String paymentMethod;
    String flexibility;
    String schedule;


    public TransportUseCase(String name, String paymentMethod, String flexibility, String schedule) {
        this.name = name;
        this.paymentMethod = paymentMethod;
        this.flexibility = flexibility;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Payment: " + paymentMethod + ", Flexibility: " + flexibility + ", Schedule: " + schedule;
    }
}

