package org.websparrow.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.websparrow.bean.PopulationBean;

import com.opensymphony.xwork2.ActionSupport;

public class PopulationAction extends ActionSupport {

	private static final long serialVersionUID = 2882111388038801283L;

	private List<PopulationBean> populationList = new ArrayList<PopulationBean>();
	ResultSet rs = null;
	PopulationBean populationBean = null;

	@Override
	public String execute() throws Exception {

		try {
			rs = org.websparrow.dao.PopulationDAO.countryPopulation();
			if (rs != null) {
				while (rs.next()) {
					populationBean = new PopulationBean();
					populationBean.setStateName(rs.getString("state_name"));
					populationBean.setStatePopulation(rs.getInt("state_population"));
					populationList.add(populationBean);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "SUCCESS";
	}

	public List<PopulationBean> getPopulationList() {
		return populationList;
	}

	public void setPopulationList(List<PopulationBean> populationList) {
		this.populationList = populationList;
	}
}
