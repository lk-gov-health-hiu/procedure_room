/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.procedure.pojo;

import java.util.ArrayList;
import lk.gov.health.procedure.enums.ObjectStatus;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author user
 */
public class ProcedureRoomPojo {
    private Long id;
    private String roomId;
    private String description;
    private ProcedureRoomTypePojo type;
    private Long instituteId;
    private ObjectStatus status;
    
    public ProcedureRoomPojo(){
    }
    
    public ProcedureRoomPojo(String room_id_, String description_, ProcedureRoomTypePojo type_,Long institute_id_, ObjectStatus status_){
        this.roomId = room_id_;
        this.description = description_;
        this.type = type_;
        this.instituteId = institute_id_;
        this.status = status_;
    }
       
    public JSONObject getJsonObject(){
        JSONObject jo_ = new JSONObject();
        
        jo_.put("roomId", this.getRoomId());
        jo_.put("description", this.getDescription());
        jo_.put("type", this.getType());
        jo_.put("instituteId", this.getInstituteId());
        jo_.put("status", this.getStatus());
        
        return jo_;        
    }
    
    public ProcedureRoomPojo getObject(JSONObject jo_) {
        this.setId(Long.parseLong(jo_.get("id").toString()));
        this.setRoomId(jo_.containsKey("roomId") ? jo_.get("roomId").toString() : null);
        this.setDescription(jo_.containsKey("description") ? jo_.get("description").toString() : null);
        this.setType(jo_.containsKey("type") ? (ProcedureRoomTypePojo)(jo_.get("type")) : null);
        this.setInstituteId(jo_.containsKey("instituteId") ? Long.parseLong(jo_.get("instituteId").toString()) : null);
        this.setStatus(jo_.containsKey("status") ? (ObjectStatus)jo_.get("status"): null); 
        
        return this;
    }   
    
    public ArrayList<ProcedureRoomPojo> getObjectList(JSONArray ja_) {
        ArrayList<ProcedureRoomPojo> ObjectList = new ArrayList<>();
        
        for (int i = 0; i < ja_.size(); i++) {
            ObjectList.add(new ProcedureRoomPojo().getObject((JSONObject) ja_.get(i)));
        }
        return ObjectList;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProcedureRoomTypePojo getType() {
        return type;
    }

    public void setType(ProcedureRoomTypePojo type) {
        this.type = type;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    public ObjectStatus getStatus() {
        return status;
    }

    public void setStatus(ObjectStatus status) {
        this.status = status;
    }  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
}
