/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


interface TransportFilter {
    void apply(TransportUseCase useCase);
}


class FlexibilityFilter implements TransportFilter {
    @Override
    public void apply(TransportUseCase useCase) {
        System.out.println("Applying flexibility filter to: " + useCase.name);
        // Add processing logic here if needed
    }
}

class PaymentMethodFilter implements TransportFilter {
    @Override
    public void apply(TransportUseCase useCase) {
        System.out.println("Applying payment method filter to: " + useCase.name);
        // Add processing logic here if needed
    }
}

class ScheduleFilter implements TransportFilter {
    @Override
    public void apply(TransportUseCase useCase) {
        System.out.println("Applying schedule filter to: " + useCase.name);
        // Add processing logic here if needed
    }
}

