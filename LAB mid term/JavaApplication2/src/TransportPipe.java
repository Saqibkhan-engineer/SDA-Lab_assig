/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA22-BSE-005
 */

import java.util.List;
import java.util.ArrayList;
class TransportPipe {
    private List<TransportFilter> filters = new ArrayList<>();

   
    public void addFilter(TransportFilter filter) {
        filters.add(filter);
    }

    public void applyFilters(TransportUseCase useCase) {
        for (TransportFilter filter : filters) {
            filter.apply(useCase);
        }
    }
}
