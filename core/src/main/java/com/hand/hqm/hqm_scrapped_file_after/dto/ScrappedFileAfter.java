package com.hand.hqm.hqm_scrapped_file_after.dto;

import java.util.Date;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_SCRAPPED_FILE")
public class ScrappedFileAfter extends BaseDTO {

     public static final String FIELD_SCRAPPED_FILE_ID = "scrappedFileId";
     public static final String FIELD_SCRAPPED_LINE_ID = "scrappedLineId";
     public static final String FIELD_FILE_ADDRESS = "fileAddress";


     @Id
     @GeneratedValue
     private Float scrappedFileId;

     private Float scrappedLineId;

     @Length(max = 300)
     private String fileAddress;

     @Transient
     private Date creationDateColumn;
     
     @Transient
     private String createdName;

     public Date getCreationDateColumn() {
		return creationDateColumn;
	}

	public void setCreationDateColumn(Date creationDateColumn) {
		this.creationDateColumn = creationDateColumn;
	}

	public String getCreatedName() {
		return createdName;
	}

	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}

	public void setScrappedFileId(Float scrappedFileId){
         this.scrappedFileId = scrappedFileId;
     }

     public Float getScrappedFileId(){
         return scrappedFileId;
     }

     public void setScrappedLineId(Float scrappedLineId){
         this.scrappedLineId = scrappedLineId;
     }

     public Float getScrappedLineId(){
         return scrappedLineId;
     }

     public void setFileAddress(String fileAddress){
         this.fileAddress = fileAddress;
     }

     public String getFileAddress(){
         return fileAddress;
     }

     }
