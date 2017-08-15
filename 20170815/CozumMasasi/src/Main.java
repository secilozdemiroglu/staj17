import java.sql.SQLException;

import Entity.Problems;
import Entity.Remarks;
import Entity.Solutions;
import Entity.Tags;
import Model.ProblemModel;
import Model.RemarkModel;
import Model.SolutionModel;
import Model.TagModel;

public class Main {

	public static void main(String[] args) throws SQLException {

		ProblemModel islem = new ProblemModel();
		Problems p = new Problems();
		Problems p2 = new Problems();
		Problems p3 = new Problems();
		Problems p4 = new Problems();
		Problems p5 = new Problems();
		RemarkModel notal = new RemarkModel();
		Remarks r1 = new Remarks();
		Remarks r2 = new Remarks();
		TagModel tag = new TagModel();
		Tags t1 = new Tags();
		Tags t2 = new Tags();
		Tags t3 = new Tags();

		// SolutionModel coz = new SolutionModel();
		Solutions s1 = new Solutions();
		Solutions s2 = new Solutions();

		p.setProblem("problem");
		p2.setProblem("Update");
		p2.setProbID(2);
		p3.setProbID(4);
		p4.setProbID(21);

		r1.setRemark("yeni not");
		r2.setRemark("Update note");
		r2.setRemarkID(2);

		s1.setSolution("Çözüm");
		s2.setSolution("Çözüm güncel");
		s2.setSolutionID(2);

		t1.setTag("hashtag");
		t2.setTag("tag güncel");
		t2.setTagID(3);
		// islem.add(p);										//problem ekle
		// islem.update(p2);									//problem güncelle	
		//System.out.println(islem.readbyid(4).getProblem()); 	//Problemin idsine göre çek
		// islem.readall(p5);									//Tüm Problemler gelsin
		// islem.delete(22);									//Problem sil

		// notal.addremark(r1);			// Remark ekle
		// notal.updateRemark(r2);		// Remark güncelle
		// notal.deleteremark(5);		//remark Sil		
		//notal.readbyid(2);			//remark ý id ye göre al
		
		// coz.addsolution(s1);		//Solution ekle
		// coz.updatesolution(s2);	//Solution güncelle
		// coz.deletesolution(4);	//Solution Sil
		
		//tag.addTag(t1);		//Tag ekle
		//tag.updateTag(t2);	//Tag güncelle
		//tag.deleteTag(4);		//Tag Sil
		System.out.println(tag.readBytagname(t1));// veritabanýnda kaçtane ayný kayýttan olduðunu gösterir
		
		
	}
}