package sr.unasat.service;

import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.WerknemerDetail;
import sr.unasat.repository.WerknemerDetailRepository;

public class WerknemerDetailService {

    private WerknemerDetailRepository werknemerDetailRepository;

    public WerknemerDetailService() {
        this.werknemerDetailRepository = new WerknemerDetailRepository(JPAConfiguration.getEm());
    }

    public WerknemerDetail addWerknemerDetail(WerknemerDetail werknemerDetail){
        return werknemerDetailRepository.addWerknemerDetail(werknemerDetail);
    }



    public WerknemerDetail updateWerknemerDetail(WerknemerDetail werknemerDetail) {
        return werknemerDetailRepository.updateWerknemerDetail(werknemerDetail);
    }

    public WerknemerDetail deleteWerknemerDetail(WerknemerDetail werknemerDetail) {
        return werknemerDetailRepository.deleteWerknemerDetail(werknemerDetail);
    }
}
