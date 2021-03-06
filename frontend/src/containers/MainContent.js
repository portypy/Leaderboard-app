import React from 'react';
import { Route, Switch }  from 'react-router-dom';
import CreateMatch from './CreateMatch'
import CreateSeason from './CreateSeason'
import SeasonResults from './SeasonResults'
import Home from '../components/Home'
import ManagePlayers from '../components/ManagePlayers'
import "./MainContent.css"

const MainContent = ({seasons, currentSeason, incrementDataCounter}) => {
        return(
            <Switch id="main-content">
                <Route exact path="/" component={Home}/>
                <Route
                    path="/create_match"
                    render={() => <CreateMatch currentSeason={currentSeason} incrementDataCounter={incrementDataCounter}/>} 
                    />
                <Route 
                    path="/create_season" 
                    render={() => <CreateSeason currentSeason={currentSeason} incrementDataCounter={incrementDataCounter}/>} 
                    />
                <Route path="/season_results" 
                    render={() => <SeasonResults seasons={seasons} />}/>
                <Route path="/players" component={ManagePlayers}/>
                
            </Switch>
        )
}

export default MainContent