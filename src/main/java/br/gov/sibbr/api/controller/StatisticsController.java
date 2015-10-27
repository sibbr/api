package br.gov.sibbr.api.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sibbr.api.Application;
import br.gov.sibbr.api.model.StatsResult;
import br.gov.sibbr.api.service.Service;

@RestController
/**
 * Controller responsible for managing statistics requests to the database
 * 
 * @author Pedro Guimarães
 *
 */
public class StatisticsController {

	// Auxiliary service class
	Service service = new Service();

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalRegistros", method = RequestMethod.GET)
	@Cacheable("total_records")
	public StatsResult fetchTotalRecords() {
		return service.fetchTotalRecords();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalRegistrosGeorreferenciados", method = RequestMethod.GET)
	@Cacheable("total_geo_records")
	public StatsResult fetchTotalGeoRecords() {
		return service.fetchTotalGeoRecords();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalRegistrosRepatriados", method = RequestMethod.GET)
	@Cacheable("total_repatriados")
	public StatsResult fetchTotalRepatriatedRecords() {
		return service.fetchTotalRepatriatedRecords();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalPublicadores", method = RequestMethod.GET)
	public StatsResult fetchTotalPublishers() {
		return service.fetchTotalPublishers();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalRecursos", method = RequestMethod.GET)
	public StatsResult fetchTotalResources() {
		return service.fetchTotalResources();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalEspecies", method = RequestMethod.GET)
	@Cacheable("total_species")
	public StatsResult fetchTotalSpecies() {
		return service.fetchTotalSpecies();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalFilo", method = RequestMethod.GET)
	@Cacheable("total_phylum")
	public StatsResult fetchTotalPhylum() {
		return service.fetchTotalPhylum();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalClasse", method = RequestMethod.GET)
	@Cacheable("total_class")
	public StatsResult fetchTotalClass() {
		return service.fetchTotalClass();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalOrdem", method = RequestMethod.GET)
	@Cacheable("total_order")
	public StatsResult fetchTotalOrder() {
		return service.fetchTotalOrder();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalGenero", method = RequestMethod.GET)
	@Cacheable("total_genus")
	public StatsResult fetchTotalGenus() {
		return service.fetchTotalGenus();
	}

	// Method responsible for managing occurrence requests
	@RequestMapping(value = Application.VERSION + "/stats/totalFamilia", method = RequestMethod.GET)
	@Cacheable("total_family")
	public StatsResult fetchTotalFamily() {
		return service.fetchTotalFamily();
	}
}