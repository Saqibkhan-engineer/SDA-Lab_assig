// Observer interface
import java.util.ArrayList;
import java.util.List;
interface TransportObserver {
    void update(TransportUseCase useCase);
}

// Concrete Observer
class TransportObserverImpl implements TransportObserver {
    @Override
    public void update(TransportUseCase useCase) {
        System.out.println("Observer notified: " + useCase.name + " - Payment Method: " + useCase.paymentMethod);
    }
}

// Subject that manages observers and notifies them
class TransportSubject {
    private List<TransportObserver> observers = new ArrayList<>();

    // Add an observer
    public void addObserver(TransportObserver observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void removeObserver(TransportObserver observer) {
        observers.remove(observer);
    }

    // Notify all observers
    public void notifyObservers(TransportUseCase useCase) {
        for (TransportObserver observer : observers) {
            observer.update(useCase);
        }
    }
}
