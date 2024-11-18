public class Main {
    public static void main(String[] args) {
        // Create transport use cases (Item1, Item2, Item3)
        TransportUseCase publicTransport = new PublicTransport();
        TransportUseCase ownConvince = new OwnConvince();
        TransportUseCase universityTransport = new UniversityTransport();

        // Create filters and add them to the pipe
        TransportPipe pipe = new TransportPipe();
        pipe.addFilter(new FlexibilityFilter());
        pipe.addFilter(new PaymentMethodFilter());
        pipe.addFilter(new ScheduleFilter());

        // Create subject and observer
        TransportSubject subject = new TransportSubject();
        TransportObserver observer = new TransportObserverImpl();
        subject.addObserver(observer);

        // Process and notify each use case
        System.out.println("Processing " + publicTransport.name);
        pipe.applyFilters(publicTransport);
        subject.notifyObservers(publicTransport);

        System.out.println("\nProcessing " + ownConvince.name);
        pipe.applyFilters(ownConvince);
        subject.notifyObservers(ownConvince);

        System.out.println("\nProcessing " + universityTransport.name);
        pipe.applyFilters(universityTransport);
        subject.notifyObservers(universityTransport);
    }
}
