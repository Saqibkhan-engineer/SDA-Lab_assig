/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */
// PublicTransport use case class
class PublicTransport extends TransportUseCase {
    public PublicTransport() {
        super("Public Transport", "Pay on spot", "Flexible", "No restrictions");
    }
}

// OwnConvince use case class
class OwnConvince extends TransportUseCase {
    public OwnConvince() {
        super("Own Convince", "Pay as you use", "Flexible schedule", "No restrictions");
    }
}

// UniversityTransport use case class
class UniversityTransport extends TransportUseCase {
    public UniversityTransport() {
        super("University Transport", "Advance payment", "Time restricted", "Fixed schedule");
    }
}

