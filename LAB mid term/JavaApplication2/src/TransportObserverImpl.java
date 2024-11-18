// Observer interface
import java.util.ArrayList;
import java.util.List;
interface TransportObserver {
    void update(TransportUseCase useCase);
}


class TransportObserverImpl implements TransportObserver {
    @Override
    public void update(TransportUseCase useCase) {
        System.out.println("Observer notified: " + useCase.name + " - Payment Method: " + useCase.paymentMethod);
    }
}


class TransportSubject {
    private List<TransportObserver> observers = new ArrayList<>();

    public void addObserver(TransportObserver observer) {
        observers.add(observer);
    }


    public void removeObserver(TransportObserver observer) {
        observers.remove(observer);
    }

   
    public void notifyObservers(TransportUseCase useCase) {
        for (TransportObserver observer : observers) {
            observer.update(useCase);
        }
    }
}
