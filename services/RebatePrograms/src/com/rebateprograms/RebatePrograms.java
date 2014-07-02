
package com.rebateprograms;

import java.util.List;
import com.rebateprograms.data.output.GetDistinctConstructiontypesByRwwutilityRtnType;
import com.rebateprograms.data.output.GetDistinctNewequipmentByRwwutilityRtnType;
import com.rebateprograms.data.output.GetHPRtnType;
import com.rebateprograms.data.output.GetNewequipmentByRwwutilityRtnType;
import com.rebateprograms.data.output.GetNewequipmentByTechnologyRtnType;
import com.rebateprograms.data.output.GetPayoutMinMaxFromRwwutilityRtnType;
import com.rebateprograms.data.output.GetQtyRtnType;
import com.rebateprograms.data.output.GetRWWUtillityPayoutsByZipCodeAndEnergytypeRtnType;
import com.rebateprograms.data.output.GetRebateEstimateRtnType;
import com.rebateprograms.data.output.GetRebateProgramCountByStateAndTechCatRtnType;
import com.rebateprograms.data.output.GetRebateprogramByRwwutilityRtnType;
import com.rebateprograms.data.output.GetRwwUtilitiesByZipcodeAndEnergytypeRtnType;
import com.wavemaker.json.type.TypeDefinition;
import com.wavemaker.runtime.data.DataServiceManager;
import com.wavemaker.runtime.data.DataServiceManagerAccess;
import com.wavemaker.runtime.data.TaskManager;
import com.wavemaker.runtime.service.LiveDataService;
import com.wavemaker.runtime.service.PagingOptions;
import com.wavemaker.runtime.service.PropertyOptions;
import com.wavemaker.runtime.service.TypedServiceReturn;


/**
 *  Operations for service "RebatePrograms"
 *  07/31/2013 10:22:53
 * 
 */
@SuppressWarnings("unchecked")
public class RebatePrograms
    implements DataServiceManagerAccess, LiveDataService
{

    private DataServiceManager dsMgr;
    private TaskManager taskMgr;

    public List<GetRebateprogramByRwwutilityRtnType> getRebateprogramByRwwutility(Integer rwwutilityid, PagingOptions pagingOptions) {
        return ((List<GetRebateprogramByRwwutilityRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRebateprogramByRwwutilityQueryName), rwwutilityid, pagingOptions));
    }

    public List<GetPayoutMinMaxFromRwwutilityRtnType> getPayoutMinMaxFromRwwutility(Integer rwwutilityid, String zipcode, PagingOptions pagingOptions) {
        return ((List<GetPayoutMinMaxFromRwwutilityRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getPayoutMinMaxFromRwwutilityQueryName), rwwutilityid, zipcode, pagingOptions));
    }

    public List<GetNewequipmentByRwwutilityRtnType> getNewequipmentByRwwutility(Integer rwwutilityid, String zipcode, PagingOptions pagingOptions) {
        return ((List<GetNewequipmentByRwwutilityRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getNewequipmentByRwwutilityQueryName), rwwutilityid, zipcode, pagingOptions));
    }

    public List<GetDistinctNewequipmentByRwwutilityRtnType> getDistinctNewequipmentByRwwutility(Integer rwwutilityid, String zipcode, PagingOptions pagingOptions) {
        return ((List<GetDistinctNewequipmentByRwwutilityRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getDistinctNewequipmentByRwwutilityQueryName), rwwutilityid, zipcode, pagingOptions));
    }

    public List<GetRebateEstimateRtnType> getRebateEstimate(Integer rwwutilityid, Integer qty, Float hp, Integer constructiontypeid, Integer newequipmentid, String zipcode, PagingOptions pagingOptions) {
        return ((List<GetRebateEstimateRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRebateEstimateQueryName), rwwutilityid, qty, hp, constructiontypeid, newequipmentid, zipcode, pagingOptions));
    }

    public List<GetRwwUtilitiesByZipcodeAndEnergytypeRtnType> getRwwUtilitiesByZipcodeAndEnergytype(String zipcode, PagingOptions pagingOptions) {
        return ((List<GetRwwUtilitiesByZipcodeAndEnergytypeRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRwwUtilitiesByZipcodeAndEnergytypeQueryName), zipcode, pagingOptions));
    }

    public List<GetHPRtnType> getHP(PagingOptions pagingOptions) {
        return ((List<GetHPRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getHPQueryName), pagingOptions));
    }

    public List<GetQtyRtnType> getQty(PagingOptions pagingOptions) {
        return ((List<GetQtyRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getQtyQueryName), pagingOptions));
    }

    public List<GetRWWUtillityPayoutsByZipCodeAndEnergytypeRtnType> getRWWUtillityPayoutsByZipCodeAndEnergytype(String zipcode, PagingOptions pagingOptions) {
        return ((List<GetRWWUtillityPayoutsByZipCodeAndEnergytypeRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRWWUtillityPayoutsByZipCodeAndEnergytypeQueryName), zipcode, pagingOptions));
    }

    public com.rebateprograms.data.RebatorTypes getRebatorTypesById(Integer id, PagingOptions pagingOptions) {
        List<com.rebateprograms.data.RebatorTypes> rtn = ((List<com.rebateprograms.data.RebatorTypes> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRebatorTypesByIdQueryName), id, pagingOptions));
        if (rtn.isEmpty()) {
            return null;
        } else {
            return rtn.get(0);
        }
    }

    public List<GetDistinctConstructiontypesByRwwutilityRtnType> getDistinctConstructiontypesByRwwutility(Integer rwwutilityid, String zipcode, PagingOptions pagingOptions) {
        return ((List<GetDistinctConstructiontypesByRwwutilityRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getDistinctConstructiontypesByRwwutilityQueryName), rwwutilityid, zipcode, pagingOptions));
    }

    public List<GetRebateProgramCountByStateAndTechCatRtnType> getRebateProgramCountByStateAndTechCat(Integer stateid, PagingOptions pagingOptions) {
        return ((List<GetRebateProgramCountByStateAndTechCatRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getRebateProgramCountByStateAndTechCatQueryName), stateid, pagingOptions));
    }

    public List<GetNewequipmentByTechnologyRtnType> getNewequipmentByTechnology(Integer technologyid, PagingOptions pagingOptions) {
        return ((List<GetNewequipmentByTechnologyRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (RebateProgramsConstants.getNewequipmentByTechnologyQueryName), technologyid, pagingOptions));
    }

    public Object insert(Object o) {
        return dsMgr.invoke(taskMgr.getInsertTask(), o);
    }

    public TypedServiceReturn read(TypeDefinition rootType, Object o, PropertyOptions propertyOptions, PagingOptions pagingOptions) {
        return ((TypedServiceReturn) dsMgr.invoke(taskMgr.getReadTask(), rootType, o, propertyOptions, pagingOptions));
    }

    public Object update(Object o) {
        return dsMgr.invoke(taskMgr.getUpdateTask(), o);
    }

    public void delete(Object o) {
        dsMgr.invoke(taskMgr.getDeleteTask(), o);
    }

    public void begin() {
        dsMgr.begin();
    }

    public void commit() {
        dsMgr.commit();
    }

    public void rollback() {
        dsMgr.rollback();
    }

    public DataServiceManager getDataServiceManager() {
        return dsMgr;
    }

    public void setDataServiceManager(DataServiceManager dsMgr) {
        this.dsMgr = dsMgr;
    }

    public TaskManager getTaskManager() {
        return taskMgr;
    }

    public void setTaskManager(TaskManager taskMgr) {
        this.taskMgr = taskMgr;
    }

}
