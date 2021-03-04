import React, { Component } from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';

require('./Stat.scss');

export const StatEditConfig = {

    emptyLabel: 'Stat',

    isEmpty: function (props) {
        return !props || !props.title;
    }
};

export default class Stat extends Component {

    get content() {
        return (
            <div class="stat__content">
                <span class="stat__title">{this.props.title}</span>
                <p class="stat__description">{this.props.description}</p>
                <span class="stat__subtitle">{this.props.subtitle}</span>
            </div>
        );
    }

    render() {
        if (StatEditConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div className="Stat">
                {this.content}
            </div>
        );
    }
}

MapTo('myspasite/components/stat')(Stat, StatEditConfig);